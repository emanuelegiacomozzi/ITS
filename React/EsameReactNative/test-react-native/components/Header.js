import React from 'react';
import { Text, View, Image, TouchableOpacity } from 'react-native';
import { useNavigation } from '@react-navigation/native';

const Header = () => {
  const imgUrl = "https://static.vecteezy.com/ti/vettori-gratis/p1/4185812-set-di-aereo-icona-nero-vettore-aereo-simbolo-set-gratuito-vettoriale.jpg";
  const navigation = useNavigation();

  return (
    <View style={styles.headerContainer}>
      <View style={styles.titleContainer}>
        <Text style={styles.agenzia}>ViaggiaConNoi.it</Text>
        <Image source={{ uri: imgUrl }} style={styles.logo} />
      </View>
      <TouchableOpacity onPress={() => navigation.navigate('Home')}>
        <Text style={styles.navLinks}>Home Page</Text>
      </TouchableOpacity>
    </View>
  );
};

const styles = {
  headerContainer: {
    textAlign: 'center',
    backgroundColor: 'black',
    padding: 50,
    color: 'white',
    width: '100%',
    flexDirection: 'row',
    justifyContent: 'space-evenly',
    alignItems: 'center',
    zIndex: 1000,
  },
  navLinks: {
    color: 'white',
    fontSize: 18,
    marginRight: 15,
    textDecorationLine: 'underline',
  },
  agenzia: {
    fontSize: 24,
    color: 'white',
    margin: 0,
  },
  titleContainer: {
    flexDirection: 'row',
    alignItems: 'center',
    justifyContent: 'center',
    flexWrap: 'wrap'
  },
  logo: {
    height: 60,
    width: 70,
    padding: 5,
    transition: 'filter 300ms',
  },
};

export default Header;
