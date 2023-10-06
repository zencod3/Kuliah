import 'package:flutter/material.dart';
import 'pages/intro_page.dart';
import 'pages/login_page.dart';
import 'pages/menu_page.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});
  
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: IntroPage(),
      routes: {
        '/intropage': (context) => const IntroPage(),
        '/menupage':(context) => const MenuPage(),
        '/loginpage':(context) => const LoginPage(),
      }
    );
  }
}