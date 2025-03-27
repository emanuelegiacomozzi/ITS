import React from 'react';
import { Text, View } from 'react-native';

const Home = () => {
  return (
    <View style={styles.container}>
      <Text style={styles.colore}>Benvenuti alla nostra agenzia di viaggi!</Text>
      <Text style={styles.colore}>
        Scopri tutte le informazioni cliccando ai link qui sopra!
      </Text>
    </View>
  );
};

const styles = {
  container: {
    padding: 20,
    marginTop: 100, 
  },
  colore: {
    color: 'black',
    fontSize: 18,
    textAlign: 'center',
    marginVertical: 10,
  },
};

export default Home;
