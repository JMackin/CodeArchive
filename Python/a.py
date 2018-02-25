	def doc_it(func):
		def new_func(*args, **kwargs):
			print(“Running: “, func.__name__)
			print(“Positional args: “, args)
			print(“Keyword args”, kwargs)

			result = func(*args, **kwargs)
			print(“result is: “, result)
			return result
		return new_func
