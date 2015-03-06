Readable Code のりぽ(Java)
----

仕様１
---
実行手順：
- eclipse でこのプロジェクトを開く
- 実行ボタンを押す

仕様３
----
実行手順
- Run -> Run Configuration
- Program Argument にファイル名を指定する（例：```resource/recipe-data.txt```）


実装で工夫した点：
- エラー処理を入れた
- ファイル名を引数で受け取るようにした
- ファイルの中身をリストにして返す関数を作った
- メソッド名を冗長にしたgetLinesFromFileName

仕様４
----
データファイルの形式：
```
オムライス
ハヤシライス
チャーハン
```
## ガード条件 
コード 

if (!file.exists()) {
	return recipes;
}

メソッドの中やループの中の早いタイミングでリターン（continue or break）する

## Javadocコメントが付いている
https://github.com/terahide/toshi0383-readable-code/blob/master/src/Recipe.java#L70
仕様が見えやすい

## インデントが揃っている
全体的に
見やすい

## 一時変数で名前をつけている 
https://github.com/terahide/toshi0383-readable-code/blob/master/src/Recipe.java#L26


String fileName = args[0]; 
コード args[0]だと意味が分からないだけどfileNameならわかる


##USAGEを定数にしている
https://github.com/terahide/toshi0383-readable-code/blob/master/src/Recipe.java#L15
コンテキスト外の情報を定数にして外に追い出している（コンテクストに集中できる）

## クラスの名前がRecipe
https://github.com/terahide/toshi0383-readable-code/blob/master/src/Recipe.java#L12
役割に対して適切な名前を付けている

## 変数の名前を１文字にせずに名前を付けている
https://github.com/terahide/toshi0383-readable-code/blob/master/src/Recipe.java#L72
役割に対して適切な名前を付けている

## 不要なコメントがない
全体
ノイズが少ない。コードで意図を伝えられている証拠

## インデントが浅い最大３階層
全体
https://github.com/terahide/toshi0383-readable-code/blob/master/src/Recipe.java#L53

読みやすい

## ジェネリクスを使って型をしばる （Java特有）e.g. List<String>
https://github.com/terahide/toshi0383-readable-code/blob/master/src/Recipe.java#L71
Collectionの要素も型安全で意図を伝えやすい

