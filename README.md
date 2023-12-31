# Code template idea
### Run tests by Docker image:

1. In current "." directory is your project which starts with root POM.</p>
2. **Windows/macOS** users run commands:

```
docker build --no-cache -t code-template-image:run-test-example -f ./Dockerfile .
docker run -it --rm code-template-image:run-test-example /bin/sh
```
3. **Linux** users run commands:

```
sudo docker build --no-cache -t code-template-image:run-test-example -f ./Dockerfile .
sudo docker run -it --rm code-template-image:run-test-example /bin/sh
```

4. Run the command `mvn test` in the shell console of docker.
5. Run the command `cat target/surefire-reports/TEST-org.example.TemplateTest.xml` in the shell console of docker to look at test report.
6. Run the command `exit` to exit from the shell console of docker.