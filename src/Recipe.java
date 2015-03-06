import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * レシピを出力するプログラム
 * @author toshi0383
 */
public class Recipe {
	
	/** 使い方 */
	private final static String USAGE = "java "+Recipe.class.getName()+" fileName [menuId]";

	/**
	 * メイン処理
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length != 1 && args.length != 2) {
			System.out.println("Usage:" + USAGE);
			return;
		}
		String fileName = args[0];
		if (!new File(fileName).exists()) {
			System.out.println("No such file found:" + fileName);
			return;
		}
		
		List<String> fileContents = getLinesFromFileName(fileName);
		if (args.length == 1) {
			print(fileContents);
			return ;
		}
		
		if (args.length == 2) {
			int menuId = Integer.parseInt(args[1]);
			print(fileContents,menuId);
			return ;
		}
	}
	
	//FIXME DRYじゃない。FullPrinterとSelectedPrinterがあればよいかも
	private static void print(List<String> fileContents){
		int i=0;
		for (String recipe : fileContents) {
			System.out.println(String.format("%d:%s",i++,recipe));
		}
	}
	
	private static void print(List<String> fileContents,int menuId){
		int i=0;
		for (String recipe : fileContents) {
			if(i != menuId){
				i++;
				continue;
			}
			System.out.println(String.format("%d:%s",i++,recipe));
		}
	}

	/**
	 * 引数のファイル名の中身を１行ずつList にいれて返す
	 * @param recipeFileName
	 * @return 取り出したデータファイルのリスト
	 */
	@SuppressWarnings("resource")
	public static List<String> getLinesFromFileName(String recipeFileName) {
		List<String> recipes = new ArrayList<String>();
		FileReader reader;
		BufferedReader br;
		try {
			File file = new File(recipeFileName);
			if (!file.exists()) {
				return recipes;
			}
			reader = new FileReader(file);
			br = new BufferedReader(reader);
			String s;
			while ((s = br.readLine()) != null) {
				recipes.add(s);
			}
		} catch(IOException e) { return recipes; }
		return recipes;
	}
}
