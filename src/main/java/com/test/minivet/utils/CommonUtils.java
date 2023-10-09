package com.test.minivet.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.lang.System.lineSeparator;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toCollection;

public class CommonUtils extends DriverBase {

    private static final Logger logger = LoggerFactory.getLogger(CommonUtils.class);


    public void validatePage(String title) {
        waitForPageToLoad();
        verifyOnCorrectPage(title);
        logger.info("On page titled {}", getDriver().getTitle());

    }

    public void waitForPageToLoad() {
        new WebDriverWait(getDriver(), Duration.ofSeconds(Constants.TIMINGS_EXPLICIT_TIMEOUT))
                .until(driver -> (JavascriptExecutor) driver)
                .executeScript("return document.readyState == 'complete'");
    }

    private void verifyOnCorrectPage(String title) {
        boolean correctPageDisplayed = getDriver().getTitle().equalsIgnoreCase(title);
        if (correctPageDisplayed) {
            return;
        }
        List<String> lines = Stream.of(
                "Failed to create " + getClass().getSimpleName(),
                "Expected title: " + title,
                "Actual title: " + getDriver().getTitle(),
                "Actual url: " + getDriver().getCurrentUrl()
        ).collect(toCollection(ArrayList::new));
        throw new RuntimeException(lines.stream().collect(joining(lineSeparator())));
    }

    public String generateRandomString(int n) {
        String alphaString = "abcdefghijklmnopqrstuvxyz";
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            int index = (int) (alphaString.length() * Math.random());
            sb.append(alphaString.charAt(index));
        }

        return sb.toString();
    }

    public String generateRandomInteger(int n) {
        String alphaInteger = "1234567890111213141516171919202122232425262728293044556677889901";
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            int index = (int) (alphaInteger.length() * Math.random());
            sb.append(alphaInteger.charAt(index));
        }

        return sb.toString();
    }

    public String randomString(int intValue) {
        char c[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int randomPosition;
        String randomString = "";
        for (int i = 0; i < intValue; i++) {
            randomPosition = generateRandomIntIntRange(0, 51);
            randomString = randomString + c[randomPosition];
        }
        System.out.println(randomString);
        return randomString;
    }

    private int generateRandomIntIntRange(int i, int i1) {

        return i;
    }

    public void names(int names) {

        String[] F_firstNames = {"Rosy", "Emma", "Olivia", "Ava", "Isabella", "Sophia", "Reeva"};
        String[] lastNames = {"Doe", "Smith", "Johnson", "Williams", "Jones", "Brown", "Hood"};

        // create an obj
//            private static Random random = new Random();
//
//            public static void main(String[] args) {
//                // generate a Random First & Last Name and print it
//                String randomName = firstNames[random.nextInt(firstNames.length)] + " " + lastNames[random.nextInt(lastNames.length)];
//                System.out.println("Random name: " + randomName);
//
//            }

    }
}