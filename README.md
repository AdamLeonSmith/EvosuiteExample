Add dependencies to maven
mvn compile -U evosuite:generate

mvn compile -U evosuite:export

mvn clean test jacoco:report

mvn -X clean jacoco:prepare-agent verify site
