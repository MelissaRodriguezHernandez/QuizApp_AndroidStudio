# QuizApp  creado con Android Studio
> Apliación afirmaciones de verdaddero y falaso con botonesy mensajes para que interactue el usuario.

> ## Componentes principales
> * Botón 'False' para decir que la afirmación es falsa
> * Botón 'True' para decir que la afirmación es correcta
> * Botón 'Next' para pasar a la siguiente pregunta
> * Botón 'Prev' para ir a la pregunta anterior
> * Un TextView donde saldra la afirmación y cuando presionamos el boton 'Next' se actualizará

## Funcionamiento de la aplicación

* En la primera pregunta ponemos una condición para que no salga el botón de 'Prev'

![principio sin boton prev](https://user-images.githubusercontent.com/91748294/197341181-fa2d5e4f-4338-4262-8ddc-62ef316eb0eb.jpg)

* En el caso que contestes correctamente saldra el mensaje 'Correct!' (Toast message)

![si contestas bien](https://user-images.githubusercontent.com/91748294/197341216-a110cd7e-8318-4646-8405-a7fca60b0b54.jpg)

* En el caso que contestes mal saldrá el mensaje 'Incorrect!' (Toast message)

![si contestas mal](https://user-images.githubusercontent.com/91748294/197341245-e8c00b86-9b48-4a0d-b760-eeecbc94c99b.jpg)

* Con los botones 'Next' y 'Prev' puedes recorrer todas las afirmaciones de delante hacia atras como prefieras

![next](https://user-images.githubusercontent.com/91748294/197341287-d3fca855-983c-4cad-bc1a-151c1520a96b.jpg)

* La última pregunta tiene incluido en el código una condición para que desaparezca el botón de 'Next'

![ultima pregunta desaparece el boton next](https://user-images.githubusercontent.com/91748294/197341335-ab44b234-460e-4e6d-9f68-32a1e12b858a.jpg)
