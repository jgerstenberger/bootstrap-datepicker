modules = {
	'bootstrap-datepicker' {
		dependsOn 'jquery'
		
		resource id:'js', url:[plugin: 'bootstrapDatepicker', dir:'js', file:"bootstrap-datepicker.js"],
			disposition: 'head'
		resource id:'css', url:[plugin: 'bootstrapDatepicker', dir:'css', file:"datepicker.css"]
	}
}