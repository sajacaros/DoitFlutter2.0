import 'package:flutter/material.dart';

void main() => runApp(const MyApp());

class MyApp extends StatefulWidget {
  const MyApp({super.key});

  @override
  State<StatefulWidget> createState() {
    return _MyApp();
  }
}

class _MyApp extends State<MyApp> {
  var switchValue = false;
  String test = 'hello'; // 버튼에 들어갈 텍스트 입력
  Color _color = Colors.blue;

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
        title: 'Flutter Demo',
        theme: ThemeData(
          primarySwatch: Colors.amber,
        ),
        darkTheme: ThemeData.light(),
        home: Scaffold(
          body: Center(
            child: ElevatedButton(
                style: ButtonStyle(backgroundColor: MaterialStateProperty.all(_color)),
                onPressed: () {
                  if (_color == Colors.blue) {
                    setState(() {
                      test = 'flutter';
                      _color = Colors.amber;
                    });
                  } else {
                    setState(() {
                      test = 'flutter';
                      _color = Colors.blue;
                    });
                  }
                },
                child: Text(test)),
          ),
        ));
  }
}
