import org.junit.Test;


public class WhenCook {
	@Test
	public void 料理をするとき(){
		レシピを全部みたい();
		idが１のメニューのレシピをみたい();
	}

	private void レシピを全部みたい() {
		Recipe.main(new String[]{"resource/recipe-data.txt"});
	}

	private void idが１のメニューのレシピをみたい() {
		Recipe.main(new String[]{"resource/recipe-data.txt","1"});
	}
}
