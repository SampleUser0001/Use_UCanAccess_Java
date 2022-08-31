# Use_UCanAccess_Java
UCanAccess（Java）を使ってAccessにアクセスする。

## 実行方法

1. Accessファイルをresources配下に配置。
2. 接続対象のファイルパスとSelect文を修正。
   - Windowsの場合、getConnectionの引数は```jdbc:ucanaccess://```に続いて・・・
     - ドライブ名＋コロン
     - スラッシュ区切りファイルパス
3. 下記実行。
   ``` bash
   mvn clean compile exec:java
   ```

## 参考

- [LibreOffice Base を使うテスト:Qiita](https://qiita.com/nanbuwks/items/3742c7ab4805d187326d)
- [SELECT文作成の基本:しろくま君のリブレオフィス塾](https://libre-juku.shirokuma-kun.com/base-room/base7-2-sql-course/base7-2-sql-course-2/)
- [AccessデータベースにJavaで接続【UCanAccess】※VSCodeで実行できるまで設定:Qiita](https://qiita.com/kazushi47/items/40dfe6a9a13e36d130aa)