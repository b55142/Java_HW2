# Java Homework 2 (CH2 / CH3)

應用軟體設計實習作業｜113360106 陳柏安

依照 CH2、CH3 投影片重寫的 Java 範例，共 49 支程式。

| 資料夾 | 內容 | 數量 |
| --- | --- | --- |
| `ch2/` | 條件判斷、迴圈、陣列與排序 | 23 支 |
| `ch3/` | 類別、物件、封裝與 Java 類別庫 | 26 支 |

## 指定投影片頁碼

- CH2：P7、P8、P10、P12、P14、P15、P16、P19、P21、P24、P26、P28、P30、P32、P34、P39、P40、P41、P42、P43、P45、P47、P49。
- CH3：P5、P6、P7、P9、P11、P12、P14、P15、P16、P17、P20、P22、P24、P26、P27、P28、P31、P34、P36、P37、P38、P40、P43、P45、P47、P51。

每支程式可獨立執行，檔名對應章節與投影片頁碼，例如 `CH2_P34.java`。

## 編譯與執行

在 Windows PowerShell 中執行（需安裝 JDK）：

```powershell
$javaFiles = Get-ChildItem ch2,ch3 -Filter '*.java'
javac -encoding UTF-8 -d out $javaFiles.FullName
java -cp out CH2_P34
```

使用 JDK 9 以上版本時，可在編譯指令加入 `--release 8`，產生 Java 8 相容的位元碼。

`CH2_P34` 可輸入 `3`，觀察 continue 跳過第 3 次處理；`CH2_P45` 與 `CH2_P47` 可輸入 `26 5 81 7 63`，比較兩種降冪排序的結果。

## 程式重點

- CH2 P15：switch 分支使用 break。
- CH2 P34：使用 continue 跳過指定迴圈次數。
- CH2 P41：依照陣列長度檢查索引。
- CH2 P45：縮小氣泡排序比較範圍，沒有交換時提前停止。
- CH2 P47：使用 Arrays.sort 與反向比較器排序。
- CH3 P22：在 setCar 中先驗證油量，再更新欄位。

`run-results.txt` 保留這 49 支程式先前的執行紀錄。
