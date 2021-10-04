# Flexible RecyclerView with Databinding

This is the sample app for the following article:
https://proandroiddev.com/flexible-recyclerview-adapter-with-mvvm-and-data-binding-74f75caef66a

## Handling event clicks (This is not covered in the article)

- If you want to handle it in the `ItemViewModel`, just define a function there and for the root view of the `ItemViewModel` in the XML add the onClick with DataBinding. An example of this can be seen at the end of the story in the **Making an ItemViewModel observable section.**

- If you want to handle the onClick in the `CarListViewModel`, you can do the same, just pass a lambda to the `ItemViewModel` in the constructor and you can call it from the XML.

- If you want to handle it in the Fragment for example showing a dialog or navigating to an other screen you would need some kind of observable LiveData, where you push events, when an onClick happens. The fragment would observe that and execute the correct action. [Example here](https://medium.com/androiddevelopers/livedata-with-snackbar-navigation-and-other-events-the-singleliveevent-case-ac2622673150).

Example of this can be found in this [commit](https://github.com/kozmi55/Flexible-RecyclerView-with-Databinding/commit/b4d6537cc10b4d015cebd5f2425f91540a3c0910).
