# ScrambledWordSolver_English
To solve those stupid whatsapp forwards where you have to guess what the work is.

1. First download the english word list. This is a onetime process.
I am downloading the list from  -  [dwyl/english-words](https://github.com/dwyl/english-words "dwyl/english-words")
Invoke the following method - 
`Downloader.downLoad(String urlToDownloadWordsFrom,File targetFileToSaveWordList);`
2. After that, every time you want to search possible english works for a scrambled set of characters, invoke - 
`Finder.findAllWordsContainingCharacters(File fileContainingWordList, String scrambledCharacters,boolean returnAfterFirstMatch);`

Or just folow the code in class - `eng.scrambled.solver.StartHere`

## Test ##
eeiilvnost == television
aloppt == [APPLOT,LAPTOP]

## TODO ##
Couldn't figure out a way to solve, if the scrambled characters results in multiple english words.
For example - AAABBEEFKLRSTT == Breakfast Table
But this my code can't solve this yet. I am still not sure how I can implement such a functionality without lots and lots of heavy processing.
Any recommendations/pull request welcome.
