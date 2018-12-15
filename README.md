# Logback-for-AWS-Lambda
When logging to stdout in AWS Lambda, the newline character ('\n') is used to mark the end of a CloudWatch event and the carriage return character ('\r') is used to mark the beginning of an actual new line within a CloudWatch event.

The maven project in this repo contains a logback.xml file that replaces all instances of the newline character in a stack trace with a carriage return character by using the XML entity for a carriage return ('&#13\;'). This makes it so that stack traces will appear as single CloudWatch event.

Note: When logging to stdout in AWS Lambda, there will always be a blank line between CloudWatch events when you export your logs to S3. There is no way around this as far as I can tell.
