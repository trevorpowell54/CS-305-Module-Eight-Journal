
# CS 305 Module Eight Journal – Artemis Financial Portfolio Reflection

## Artemis Financial Client and Software Requirements

Artemis Financial is a financial company that handles sensitive client financial information. For this project, the client needed its software application to provide stronger protection for financial information, secure communications between the client and application server, and a way to verify that data had not been modified. My role was to review the application's security requirements and refactor the software to implement secure software practices. The primary improvements included recommending AES-256-GCM for protecting sensitive financial information, implementing SHA-256 checksum functionality for data-integrity verification, and configuring HTTPS/TLS for secure communications. The application was configured to use a PKCS12 keystore and certificate and provide the secure `/hash` endpoint through HTTPS on port 8443.

## What I Did Well and the Importance of Secure Coding

I believe I did well identifying the security areas that required improvement and applying established security technologies instead of creating custom security solutions. One of the strongest parts of my work was distinguishing the different purposes of encryption and hashing. I recommended AES-256-GCM for protecting sensitive information because it provides confidentiality and authentication, while SHA-256 was implemented separately for checksum and data-integrity verification. I also used Java's standard `MessageDigest` API instead of attempting to create my own hashing implementation.
Coding securely is important because software vulnerabilities can expose sensitive financial information and create risks for a company and its customers. Secure coding can help reduce the possibility of data breaches, financial losses, operational disruptions, legal exposure, and damage to customer trust. For a financial organization such as Artemis Financial, protecting customer information is especially important because security is directly connected to the company's reputation and overall well-being.

## Challenging and Helpful Parts of the Vulnerability Assessment

One of the most helpful parts of the assessment was learning how different areas of an application can require different security controls. The project required me to consider architecture, input validation, APIs, cryptography, client/server communications, code errors, code quality, encapsulation, controllers, data access, services, and third-party dependencies. This helped me understand that securing an application requires more than simply adding encryption.

The dependency analysis was also helpful because OWASP Dependency-Check allowed me to examine third-party dependencies for known vulnerabilities. This reinforced the importance of considering security throughout the software development lifecycle and not only reviewing code that I personally wrote.

## Increasing Layers of Security

I increased the application's layers of security by implementing multiple security controls rather than relying on a single solution. HTTPS/TLS provides a secure communication layer for information traveling between the client and application server. SHA-256 provides checksum functionality and data-integrity verification. AES-256-GCM was recommended as the encryption solution for sensitive financial information because it provides both confidentiality and authentication. The application also used a PKCS12 keystore containing the certificate and private key to support the secure HTTPS configuration.

In the future, I would continue using vulnerability assessment tools, dependency analysis, manual code reviews, functional testing, and established secure software development practices when determining which vulnerabilities to address and which mitigation techniques to use. I would consider the type of vulnerability, the security requirement involved, and the potential effect on the application when deciding how to mitigate a security issue.

## Ensuring the Code and Application Were Functional and Secure

I made sure the application remained functional by compiling and executing the refactored application and testing the new security functionality. I verified the SHA-256 checksum functionality through the `/hash` endpoint and tested the secure HTTPS connection through `https://localhost:8443/hash`. I also reviewed the application after the security modifications to make sure the changes did not prevent the application from starting or functioning as required.

After refactoring the application, I used OWASP Dependency-Check as a secondary testing mechanism to identify known vulnerabilities in third-party dependencies. I also manually reviewed and tested the `/hash` API and HTTPS functionality. These steps helped me determine whether the security modifications affected application functionality or introduced additional known dependency vulnerabilities.

## Resources, Tools, and Coding Practices

The resources and tools I used included Java, Spring Boot, Java's `MessageDigest` API, HTTPS/TLS, a PKCS12 keystore, and OWASP Dependency-Check. I also used NIST recommendations and OWASP guidance when applying secure software practices. The project emphasized using established security APIs and standards rather than developing custom cryptographic functionality.

One coding practice I will continue using is relying on established and tested security libraries and APIs. For example, using Java's `MessageDigest` API for SHA-256 reduces the risk of manually implementing a cryptographic algorithm. I also learned the importance of dependency analysis, functional testing, manual code review, and testing security changes after refactoring.

## What I Would Show Future Employers

For future employers, I would show my completed **Artemis Financial Practices for Secure Software Report** and the related source code from this project. This project demonstrates my ability to apply secure software development practices to an existing application rather than simply developing software without considering security.

The project demonstrates several skills that would be valuable to an employer, including identifying security requirements, selecting appropriate cryptographic technologies, implementing SHA-256 functionality, configuring HTTPS/TLS, working with certificates and a PKCS12 keystore, testing an application after refactoring, reviewing third-party dependencies with OWASP Dependency-Check, and applying industry-standard secure coding practices. The project also demonstrates that I understand the importance of maintaining application functionality while making security improvements.

## Portfolio Artifact

The artifact I selected for my CS 305 portfolio is the **Artemis Financial Practices for Secure Software Report** completed for Project Two. This report documents the security improvements, testing, cryptographic recommendations, HTTPS/TLS implementation, and secure software development practices applied to the Artemis Financial application.


