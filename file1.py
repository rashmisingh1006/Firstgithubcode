from translate import Translator
translator = Translator(to_lang="ja")
try:
	with open('./apps/text2.txt', mode='r') as my_file:
		text = my_file.read()
		translation = translator.translate(text)
		print(translation)
except FileNotFoundError as e:
	    print('check your File Path Silly!')






