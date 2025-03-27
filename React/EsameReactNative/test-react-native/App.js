import React from 'react';
import { NavigationContainer } from '@react-navigation/native';
import { createStackNavigator } from '@react-navigation/stack';
import Voli from './components/Voli';
import Compagnie from './components/Compagnie';
import Aeroporti from './components/Aeroporti';
import Header from './components/Header';
import Home from './components/Home';
import Navbar from './components/Navbar';
import { View, Text, StyleSheet, ScrollView } from 'react-native';

const Stack = createStackNavigator();

function App() {
  return (
    <NavigationContainer>
      <View style={styles.pageContainer}>
        <Header />
        <Navbar />
        <ScrollView contentContainerStyle={styles.mainApp}>
          <Stack.Navigator initialRouteName="Home">
            <Stack.Screen name="Home" component={Home} />
            <Stack.Screen name="Voli" component={Voli} />
            <Stack.Screen name="Compagnie" component={Compagnie} />
            <Stack.Screen name="Aeroporti" component={Aeroporti} />
          </Stack.Navigator>
        </ScrollView>
        <View style={styles.footerClass}>
          <Text style={styles.footerText}>&copy; 2025 Agenzia di Viaggi online. Tutti i diritti riservati.</Text>
        </View>
      </View>
    </NavigationContainer>
  );
}

const styles = StyleSheet.create({
  pageContainer: {
    flex: 1,
    backgroundColor: 'white',
  },
  mainApp: {
    marginTop: 60,
    padding: 20,
    flexGrow: 1,
  },
  footerClass: {
    backgroundColor: 'black',
    padding: 20,
    width: '100%',
    position: 'absolute',
    bottom: 0,
    left: 0,
    zIndex: 1000,
    textAlign: 'center',
    justifyContent: 'center',  
    alignItems: 'center',      
  },
  footerText: {
    color: 'white',           
    fontSize: 14,             
  },
  headerText: {
    fontSize: 30,            
    fontWeight: 'bold',       
  }
});

export default App;
