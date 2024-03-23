package main.kotlin.statickotlin

class Files {
    companion object {
        val localConfigFile: String = "local.properties"
//        public static final String MY_FILE_NAME = "myFile.txt"
        //the same for kotlin
        const val MY_FILE_NAME = "myFile.txt"
    }
}