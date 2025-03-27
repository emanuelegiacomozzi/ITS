import { useState, useEffect } from 'react';
import { View, Text, FlatList, StyleSheet, ActivityIndicator, Alert } from 'react-native';
import axios from 'axios';

function Voli() {
  const [dati, setDati] = useState([]);
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    const fetchDati = async () => {
      try {
        const response = await axios.get('http://localhost:5002/api/voli');
        setDati(response.data);
      } catch (err) {
        console.error('Errore nel recupero dei dati: ', err);
        Alert.alert('Errore', 'Errore nel recupero dei dati');
      } finally {
        setLoading(false);
      }
    };

    fetchDati();
  }, []);

  if (loading) {
    return <ActivityIndicator size="large" color="#007AFF" style={styles.loader} />;
  }

  return (
    <View style={styles.container}>
      <FlatList
        data={dati}
        keyExtractor={(item, index) => index.toString()}
        ListHeaderComponent={() => (
          <View style={styles.headerRow}>
            <Text style={styles.headerText}>Codice Volo</Text>
            <Text style={styles.headerText}>Compagnia</Text>
            <Text style={styles.headerText}>Durata</Text>
          </View>
        )}
        renderItem={({ item }) => (
          <View style={styles.row}>
            <Text style={styles.cell}>{item[0]}</Text>
            <Text style={styles.cell}>{item[1]}</Text>
            <Text style={styles.cell}>{item[2] || 'N/A'}</Text>
          </View>
        )}
      />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    padding: 10,
    backgroundColor: '#f5f5f5',
  },
  loader: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
  },
  headerRow: {
    flexDirection: 'row',
    backgroundColor: '#007AFF',
    paddingVertical: 10,
    borderRadius: 5,
  },
  headerText: {
    flex: 1,
    fontWeight: 'bold',
    color: 'white',
    textAlign: 'center',
  },
  row: {
    flexDirection: 'row',
    backgroundColor: 'white',
    paddingVertical: 10,
    marginVertical: 5,
    borderRadius: 5,
    elevation: 2,
  },
  cell: {
    flex: 1,
    textAlign: 'center',
    color: '#333',
  },
});

export default Voli;
