package hw11UseOfSuperInChildClass;

public class TestFamily {
	public static void main(String[]args) {
		Father fatherDefault =new Father();
		Father fatherParam=new Father("feroz", 65, 'M', false);
		fatherDefault.father();
		fatherParam.fatherInfo("feroz", 65, 'M', false);

		Daughter daughterDefault=new Daughter();
		Daughter daughterParam=new Daughter("feb", 5,"feroz", 65, 'M', false);
		daughterDefault.daughter();
		daughterParam.daughterInfo("feb", 5);
			
	}

}
