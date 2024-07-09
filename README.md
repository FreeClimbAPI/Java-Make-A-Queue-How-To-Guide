# Java - Make a Queue How-To Guide

This project serves as a guide to help you build an application with FreeClimb. View this how-to guide on [FreeClimb.com](https://docs.freeclimb.com/docs/make-a-queue#section-java). Specifically, the project will:

- Makes a queue which can be used to enqueue callers

## Setting up your new app within your FreeClimb account

To get started using a FreeClimb account, follow the instructions [here](https://docs.freeclimb.com/docs/getting-started-with-freeclimb).

## Setting up the how-to guide

1. Configure environment variables.

   | ENV VARIABLE | DESCRIPTION                                                                                                                           |
   | ------------ | ------------------------------------------------------------------------------------------------------------------------------------- |
   | ACCOUNT_ID   | Account ID which can be found under [API credentials](https://www.freeclimb.com/dashboard/portal/account/authentication) in Dashboard |
   | API_KEY      | API key which can be found under [API credentials](https://www.freeclimb.com/dashboard/portal/account/authentication) in Dashboard    |

## Building and runnning the how-to guide

1. Build and run the application using command:

   ```bash
   gradle build && java -Dserver.port=3000 -jar build/libs/Java-Make-A-Queue-Tutorial-3.0.6-plain.jar
   ```
