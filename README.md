# springboot-helloworld

Spring Bootでhello worldするWebアプリケーションです。  
Dockerコンテナで起動したMySQLを使って動きます。

## Requirements

- JDK11
- [Docker](https://www.docker.com/)
- [jenv](https://github.com/jenv/jenv) (Optional)

## Running App

```shell
docker-compose up -d
./gradlew bootRun
```

## Usage

下記URLへアクセスすると"hello world!"が返ります。  
http://localhost:8080/hello

```shell
$ curl http://localhost:8080/hello
hello, world!
```

クエリストリングで言語コード`lang`を指定すると、指定した言語で"hello world!"してくれます。  
http://localhost:8080/hello?lang=ja

```shell
$ curl http://localhost:8080/hello?lang=ja
こんにちは世界！
```

## Development

下記URLへアクセスすると、phpMyAdminでMySQLを操作できます。  
http://localhost:8888
