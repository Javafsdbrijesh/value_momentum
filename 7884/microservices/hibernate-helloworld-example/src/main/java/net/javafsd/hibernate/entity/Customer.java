<!DOCTYPE hibernate-configuration PUBLIC

        "-//Hibernate/Hibernate Configuration DTD 3.0//EN"

        "http://www.hibernate.org/dtd/hibernate-configuration-3.0.dtd">

<hibernate-configuration>

    <session-factory>

        <!-- JDBC Database connection settings -->

        <property name="connection.driver_class">com.mysql.cj.jdbc.Driver</property>

        <property name="connection.url">jdbc:mysql://localhost:3306/employee?useSSL=false</property>

        <property name="connection.username">root</property>

        <property name="connection.password">root</property>

        <!-- JDBC connection pool settings ... using built-in test pool -->

        <property name="connection.pool_size">1</property>

        <!-- Select our SQL dialect -->

        <property name="dialect">org.hibernate.dialect.MySQL5Dialect</property>

        <!-- Echo the SQL to stdout -->

        <property name="show_sql">true</property>

        <!-- Set the current session context -->

        <property name="current_session_context_class">thread</property>

        <!-- Drop and re-create the database schema on startup -->

        <property name="hbm2ddl.auto">create-drop</property>

        <!-- dbcp connection pool configuration -->

        <property name="hibernate.dbcp.initialSize">5</property>

        <property name="hibernate.dbcp.maxTotal">20</property>

        <property name="hibernate.dbcp.maxIdle">10</property>

        <property name="hibernate.dbcp.minIdle">5</property>

        <property name="hibernate.dbcp.maxWaitMillis">-1</property>

        <mapping class="net.javafsd.hibernate.entity.Student" />

    </session-factory>

</hibernate-configuration>

[3:15 PM] Brijesh (Guest)
<project xmlns="http://maven.apache.org/POM/4.0.0"

    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"

    xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">

    <modelVersion>4.0.0</modelVersion>

    <groupId>net.javafsd</groupId>

    <artifactId>hibernate-helloworld-example</artifactId>

    <version>0.0.1-SNAPSHOT</version>

    <name>hibernate-helloworld-example</name>

    <description>hibernate-helloworld-example</description>

    <properties>

        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>

    </properties>

    <dependencies>

        <!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->

        <dependency>

            <groupId>mysql</groupId>

            <artifactId>mysql-connector-java</artifactId>

            <version>8.0.13</version>

        </dependency>

        <!-- https://mvnrepository.com/artifact/org.hibernate/hibernate-core -->

        <dependency>

            <groupId>org.hibernate</groupId>

            <artifactId>hibernate-core</artifactId>

            <version>5.3.7.Final</version>

        </dependency>

        <dependency>

            <groupId>javax.xml.bind</groupId>

            <artifactId>jaxb-api</artifactId>

            <version>2.3.0</version>

        </dependency>

        <dependency>

            <groupId>org.eclipse.persistence</groupId>

            <artifactId>org.eclipse.persistence.moxy</artifactId>

            <version>2.7.3</version>

        </dependency>

        <dependency>

            <groupId>com.sun.xml.bind</groupId>

            <artifactId>jaxb-impl</artifactId>

            <version>2.3.0</version>

        </dependency>

        <dependency>

            <groupId>com.sun.xml.bind</groupId>

            <artifactId>jaxb-core</artifactId>

            <version>2.3.0</version>

        </dependency>

    </dependencies>

    <build>

        <sourceDirectory>src/main/java</sourceDirectory>

        <plugins>

            <plugin>

                <artifactId>maven-compiler-plugin</artifactId>

                <version>3.5.1</version>

                <configuration>

                    <source>1.8</source>

                    <target>1.8</target>

                </configuration>

                <dependencies>

                    <dependency>

                        <groupId>org.glassfish.jaxb</groupId>

                        <artifactId>jaxb-runtime</artifactId>

                        <version>2.3.3</version>

                    </dependency>

                </dependencies>

            </plugin>

        </plugins>

    </build>

</project>

