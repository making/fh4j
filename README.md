# FH4J

Fullwitdh - Halfwith converter for Java

[![Build Status](https://travis-ci.org/making/fh4j.svg)](https://travis-ci.org/making/fh4j)

``` java
assertThat(DefaultFullHalf.INSTANCE.toFullwidth("Hello World!"), is("Ｈｅｌｌｏ　Ｗｏｒｌｄ！"));
assertThat(DefaultFullHalf.INSTANCE.toFullwidth("ﾊﾛｰﾜｰﾙﾄﾞ!"), is("ハローワールド！"));
        
assertThat(DefaultFullHalf.INSTANCE.toHalfwidth("Ｈｅｌｌｏ　Ｗｏｒｌｄ！"), is("Hello World!"));
assertThat(DefaultFullHalf.INSTANCE.toHalfwidth("ハローワールド！"), is("ﾊﾛｰﾜｰﾙﾄﾞ!"));
```

Default conversion table is [here](https://github.com/making/fh4j/blob/master/src/main/java/fh4j/DefaultFullHalf.java).

## License

Licensed under the Apache License, Version 2.0.
