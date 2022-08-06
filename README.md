# SpringBootSecurity
SpringBootSecurity 


Date: February 18, 2022

Owner: Subrata Dey

[TOC]

# 1. Revision history

| Date              | Version | Overview      | Modified | Reviewed  By |
| ----------------- | ------- | ------------- | -------- | ------------ |
| February 18, 2022 | 1.0     | Newly created | Subrata  |              |

# 2. Abbreviation

　● Abbreviations are given in this manual.

| Abbreviations | Definitions                   |
| ------------- | ----------------------------- |
| JSON          | JavaScript Object Notation    |
| API           | Application Program Interface |

# 3.Tags/Terms

　● few basic terms that are related to spring security.

| Terms/Tag                  | Definitions                                                  |
| -------------------------- | ------------------------------------------------------------ |
| **Principal**              | Currently logged in user.                                    |
| **Authentication**         | Confirming truth of credentials.                             |
| **Authorisation**          | Defines access policy for the Principal.                     |
| **GrantedAuthority**       | Permission granted to the principal.                         |
| **AuthenticationManager**  | Controller in the authentication process. Authenticates user saved in memory via authenticate(). |
| **AuthenticationProvider** | Interface that maps to a data store that stores your data.   |
| **Authentication Object**  | Object that is created upon authentication. It holds the login credentials. It is an internal spring security interface. |
| **UserDetails**            | Data object that contains the user credentials but also the role of that user. |
| **UserDetailsService**     | Collects the user credentials, authorities (roles) and build an UserDetails object. |

# 3. Spring Security Concept

All APIs 

# 4. Architecture

![series-2-2-min](./template/series-2-2-min.jpg)

# 5.Reference Documentation

For further reference, please consider the following sections:

- [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
- [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.6.4/maven-plugin/reference/html/)
- [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.6.4/maven-plugin/reference/html/#build-image)
- [Spring Web](https://docs.spring.io/spring-boot/docs/2.6.4/reference/htmlsingle/#boot-features-developing-web-applications)
- [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.6.4/reference/htmlsingle/#boot-features-jpa-and-spring-data)
- [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.6.4/reference/htmlsingle/#using-boot-devtools)
- [Spring Security](https://docs.spring.io/spring-boot/docs/2.6.4/reference/htmlsingle/#boot-features-security)

# 6.Guides

The following guides illustrate how to use some features concretely:

- [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
- [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
- [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
- [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
- [Securing a Web Application](https://spring.io/guides/gs/securing-web/)
- [Spring Boot and OAuth2](https://spring.io/guides/tutorials/spring-boot-oauth2/)
- [Authenticating a User with LDAP](https://spring.io/guides/gs/authenticating-ldap/)
- [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)