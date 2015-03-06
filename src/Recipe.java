import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * オムライスと出力する
 * @author toshi0383
 */
public class Recipe {
	
	/** 使い方 */
	private final static String USAGE = "java Recipe [fileName]";
	/**
	 * メイン処理
	 * @param args
	 */
	public static void main(String[] args) {
		if (args == null || args.length == 0) {
			System.out.println("Usage:" + USAGE);
			return;
		}
		String fileName = args[0];
		if (!new File(fileName).exists()) {
			System.out.println("No such file found:" + fileName);
			return;
		}
		for (String recipe : getLinesFromFileName(fileName)) {
			System.out.println(recipe);
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
