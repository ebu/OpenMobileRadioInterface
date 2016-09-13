# OpenMobileRadioInterface

This is the OpenMobileRadioInterface API project. Goal is to develop a Java/Android API for application level access to integrated tuner hardware. This project currently contains only the API definition in the form of Java source code files.

## OMRI (Open Mobile Radio Interface) Background and Goals

The IDAG have successfully negotiated the development of the first DAB+ smartphone with LG, that smartphone, the LG Stylus 2 DAB, was launched at radiodays in Paris in March and rolled out for commercial sale in Europe, Australia and other countries in April and May 2016.

The goal of this OpenMobileRadioInterface API is allow custom applications a standardized access to tuner functionalities, which will enable application developers to implement advanced features such as Categorised SlideShow, ClickThroughURLs and hybrid functionality. The goals of developing an universal API are:
*   provide an easy to use application layer interface to embedded tuner functionalities
*   ideally, implementations of this API will enable the "write once run anywhere" promise for application developers and content providers 
*	help increasing the number of smartphones which include DAB by make it easier for the smartphone and chip manufacturers to implement DAB functionality

## Your feedback is needed

Specifications like this live from the accaptance of the developers. Only if the the API makes life easier, all of us can benefit from such a development. Therfore we hope, to gather as much interested people as possible to provide us with feedback regarding the current proposal.

## Create browsable HTML javadoc files 

In order to create a more accessible version of the API, it's easy to create the HTML javadoc with the following command. (JRE installation required)

```
javadoc -d "PATH_WHERE_YOU_WANT_TO_STORE_THE_HTML_FILES" -sourcepath "./src" -subpackages org
```
