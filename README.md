JAK ZROBIC LISTVIEW             

w mainactivititi          

private ListView listView;          
private ArrayList jakasLista;          
private ArrayAdapter arrayAdapter;          

jakaslista = new ArrayList<>();            
arrayAdapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, jakaslista);                
listView = findViewById(R.id.jakisListVIew);              
listView.setAdapter(arrayAdapter);            

zeby zaktualizowac listview po zmianie danych w liscie: arrayAdapter.notifyDataSetChanged();
