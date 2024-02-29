# SpringBootObfuscate

SpringBootObfuscate is a tool used to obfuscate Java class files in your Spring Boot applications. This enhances the security of your code in production environments.

## Usage

Follow these steps after cloning the project:

1. Update the `application.properties` file and configure the necessary settings.
2. Open the terminal in the project directory and run the command `mvn clean package`.
3. Then, start the application by using the command `java -jar target/springbootobfuscate-1.0.jar`.

## Considerations

- The obfuscation process affects all classes used in your application. Therefore, carefully review and test before proceeding with the obfuscation process.
- The obfuscation process is irreversible, so remember to make backups before performing this operation.

## Contributions

Contributions to this project are welcome! You can contribute to the project's development by sharing your code or opening issue reports.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more information.
