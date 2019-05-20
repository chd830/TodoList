# TodoList
## 리눅스 기준으로 실행하기 위해 필요한 설치 

### <u>JDK </u>

* 패키지 업데이트
> * `sudo apt-get update`

* JDK설치
> * `sudo apt-get install oracle-java8-installer`

* CLASSPATH설정
> * `sudo vi /etc/profile` 를 이용하여 접근
> * `export JAVA_HOME=설치경로`
```
 `export PATH=$PATH:$JAVA_HOME/bin`
 `CLASSPATH:$JAVA_HOME/lib`
 `esc -> wq!` 입력으로 저장
```
> * `source /etc/profile`으로 반영
> * `java -version`를 입력해서 java version이 표시되는지 확인

### <u>Tomcat</u>

* 패키지 업데이트
> * `sudo apt-get update`

* Tomcat설치
> * `sudo apt-get install tomcat8`

* CLASSPATH설정
> * `sudo vi /etc/profile` 를 이용하여 접근하여 설정 입력하기
```
>  `export CATALINA_HOME=/usr/local/tomcat`
>  `export PATH=$PATH:$JAVA_HOME/bin`에 `:$CATALINA_HOME/bin`추가
>  `esc -> wq!` 
```
> * `source /etc/profile`으로 반영
> * `javac -version`를 입력해서 javac version이 표시되는지 확인

* Tomcat 실행
> * `cd 'Tomcat위치'/bin`으로 이동
> * `sudo ./shutdown.sh`으로 Tomcat을 끈 
> * `sudo ./startup.sh`으로 Tomcat실행

***
## 리눅스 기준으로 실행하기 위한 빌드방법

* 관리자 화면으로 접근할 수 있게 설정하기
> * `sudo apt-get install tomcat8-admin`으로 tomcat8-admin설치
> * `cd etc/tomcat8`로 이동하여 `sudo nano tomcat-user.xml`으로 tomcat-user.xml 파일 열기
> * tomcat-user.xml에 설정 입력하기
```
>> * <role rolename="manager-gui"/>
>> * <role rolename="manager-script"/>
>> * <user username="tomcat" password="tomcat-test" roles="manager-gui,manager-script"/> 
``` 
> * sudo service tomcat8 start

* Maven을 이용해 배포하기
>> * pom.xml파일의 <u><dependencies></dependencies></u>사이에 내용 추가하기
```
<dependency>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-compiler-plugin</artifactId>
    <version>3.7.0</version>
</dependency>

```
>> * pom.xml파일의 <u><plugins></plugins></u>사이에 내용 추가하기
```
    <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-war-plugin</artifactId>
        <version>3.7</version>
        <configuration>
            <warsourcedirectory>src/main/webapp</warsourcedirectory>
            <webxml>src/main/webapp/WEB-INF/web.xml</webxml>
        </configuration>
    </plugin>
 
    <plugin>
        <groupId>org.codehaus.mojo</groupId>
        <artifactId>tomcat-maven-plugin</artifactId>
        <version>3.7</version>
        <configuration>
            <url>http://서버 IP주소:톰캣 포트번호/manager/text</url>
            <path>/프로젝트명</path>
            <username>관리자 계정</username>
            <password>비밀번호</password>
        </configuration>
    </plugin> 
```
>> * Edit Figuration -> Maven선택 후 Name을 complie war, Command line을 complie war:war로 설정하여 Run한다.
>> * target파일에 .war가 생성된 것 
