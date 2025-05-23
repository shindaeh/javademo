package java018_collection.part14;

public class HomeAgency implements Rentable<Home> {

	@Override
	public Home rent() {
		return new Home();
	}

}

//위에 제너릭<> 에서 <Home>을 지워서 오버라이드에서 Object rent()가 되는것 
//public class HomeAgency implements Rentable{
//	@Override
//	public Object rent() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//}