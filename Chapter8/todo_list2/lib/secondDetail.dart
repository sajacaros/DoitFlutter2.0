import 'package:flutter/material.dart';

class SecondDetail extends StatelessWidget {
  TextEditingController controller = new TextEditingController();
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text('Second Page')),
      body: Container(
        child: Center(
          child: Column(
            children: [
              TextField(
                controller: controller,
                keyboardType: TextInputType.text,
              ),
              ElevatedButton(
                onPressed: () {
                  Navigator.of(context).pop(controller.value.text);
                },
                child: Text('저장하기'),
              ),
            ],
          ),

        ),
      ),
    );
  }

}