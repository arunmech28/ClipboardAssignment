###Project Details

####Libraries/Framework used

1. Springboot
2. Selenide
3. Lombok
4. Junit

####Run Instructions

`mvn clean test` to run the amazon test

#####To pass additional arguments

`mvn clean test -Dbrowser=chrome -Drunmode=remote` to run in selenoid.
# Note: before running the test in remote mode, please spin up the docker container with selenoid image