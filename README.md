# SpringBootWithSonarQube
SpringBootWithSonarQube


1. Create empty repo in github.
2. clone repo in local laptop/machine
3. create simple project in that git cloned folder.
4. In my case I created spring boot project.
5. push project on github.
6. In my case I used "team" feature from eclipse.
7. go to create accound on SonarQube cloude.
8. I created own manually org and simple project.
9. Copy code from SonarQube and paste in pom.xml in property section.
10. copy credentials and paste in repo security access variables/token.
11. copy yml file from SonarQube and create directory in repo inside .github/workflows/
12. Then above yml will be reflect in github actions tab.
13. I adjusted my navigation path in yml file beacuse system was not able to find pom file.
14. ---
15. SonarQube in Master branch was setup!
16. I deleted main branch and renamed "Master" to "main" so sonarqube accessing my main branch!
This was needed because "main" branch for subscription is needed! LOL
17. Then observe in SonarQube UI.
18. Note: keep pull/push from eclipse so both should be in sync!
19. ----
20. Happy Coding!
