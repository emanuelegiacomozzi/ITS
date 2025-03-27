import React from 'react';
import { View, Text, TouchableOpacity } from 'react-native';
import { useNavigation } from '@react-navigation/native';

const Navbar = () => {
  const navigation = useNavigation();

  return (
    <View style={styles.navbarContainer}>
      <TouchableOpacity onPress={() => navigation.navigate('Voli')}>
        <Text style={styles.navLinks}>Voli</Text>
      </TouchableOpacity>
      <TouchableOpacity onPress={() => navigation.navigate('Compagnie')}>
        <Text style={styles.navLinks}>Compagnie</Text>
      </TouchableOpacity>
      <TouchableOpacity onPress={() => navigation.navigate('Aeroporti')}>
        <Text style={styles.navLinks}>Aeroporti</Text>
      </TouchableOpacity>
    </View>
  );
};

const styles = {
  navbarContainer: {
    backgroundColor: 'rgb(78, 76, 76)',
    padding: 10,
    color: 'white',
    width: '100%',
    display: 'flex',
    justifyContent: 'space-evenly',
    alignItems: 'center',
    zIndex: 999,
    flexDirection: 'row',
    position: 'absolute',
    top: 150,
  },
  navLinks: {
    color: 'white',
    fontSize: 18,
    marginRight: 15,
    textDecorationLine: 'underline',
  },
};

export default Navbar;
