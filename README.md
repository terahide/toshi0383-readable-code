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

## インデントが揃っている

## 一時変数で名前をつけている 
Line：26 

コード 
String fileName = args[0]; 

##USAGEを定数にしている


Line:15

## クラスの名前がRecipe

## 変数の名前を１文字にせずに名前を付けている

e.g. reader （Line:44）

## コメントがない（ノイズが少ない）

## インデントが浅い最大３階層

## ジェネリクスを使って型をしばる List<String>