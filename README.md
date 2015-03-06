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