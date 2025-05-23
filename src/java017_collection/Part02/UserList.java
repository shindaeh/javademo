package java017_collection.Part02;

//선형리스트( Linear List )
//1 순서 리스트(Ordered List)
//2 자료들 간에 순서를 갖는 리스트
//3 선형 리스트에서 원소를 추가한 순서는 원소들의 순서가 된다.

public class UserList {
	private Object[] sale;
	private int pointer; // 현재 메모리의 위치

	// objct배열 this
	public UserList() {
		this(3);
	}

	public UserList(int cnt) {
		// 배열의 크기를 3으로 고정한다.
		sale = new Object[cnt];
	}

//append
//elemnet 요소값을 넣는다.
//++로 포인트 위치를 1칸씩 이동시킨다.
	public void add(Object element) {
		if (sale.length == pointer) {
			// 현재 sale의 배열크기가 모자라 arr을 생성해 배열 크기를 2배로 늘린다.
			// 기존의 배열 크기의 곱하기 2
			Object[] arr = new Object[sale.length * 2];

			// 현재 sale의 요소값을 새로 만든 object arr값에 복사한다.
			// arr값에는 sale의 원본 값이 카피되야한다.
			System.arraycopy(sale, 0, arr, 0, sale.length);

			// 현재 sale이 기존의 arr을 참조하고 있기 때문에
			// 현재의 arr로 참조값을 바꿔야한다.
			sale = arr;
		}
		sale[pointer++] = element;
	}

//insert
//mian 클래스에서 us.add(2,50); 2인덱스에 50을 넣는다.
	public void add(int index, Object element) {
		if (sale.length == pointer) {
			Object[] arr = new Object[sale.length * 2];
			System.arraycopy(sale, 0, arr, 0, sale.length);
			sale = arr;
		}
		// 값을 바로 삽입하면 기존의 값은 사라지고 삽입된 갑이 들어간다.
		// 그래서 고정된 값 뒤에 새로운 값이 들어가게 설정해줘야 한다.
		for (int i = pointer; i > index; i--) {
			// 현재 인덱스보다 -1이 되어야 2의 인덱스가 값을 나오게 할 수 있다.
			sale[i] = sale[i - 1];

		}
		sale[index] = element;
		// 포인터가 다음 인덱스를 가르키기 위해서
		pointer++;
	}

// get
	public Object get(int index) {
		if (index < pointer)
			return sale[index];
		else
			throw new ArrayIndexOutOfBoundsException(index);
	}

//remove
	//현재 포인터가 가르키는곳은 +1되어있는 상태이기 때문에
	//i에 인덱스 초기값을 설정하여 포인트보다 작을떄까지 기준으로 -1로 포인트 설정
	public Object remove(int index) {
		Object data = sale[index];
		for (int i = index; i < pointer-1; i++) {
			sale[i] = sale[i + 1];
		}
		pointer--;
		return data;
	}

//요소갯수
//size는 배열속 안에 들어가있는 값 [10][20] (인덱스 안속 값)
	public int size() {
		return pointer;
	}

//메모리의 크기 배열의 전체 값 [1][2][3] (전체 인덱스로 생각하기)
	public int capacity() {
		return sale.length;
	}
}// end class
