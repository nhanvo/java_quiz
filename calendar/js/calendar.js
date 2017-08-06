// JavaScript Document
$(function(){
	// Class Calendar
	function Calendar() {
		// Mapping with day in week
		var DAY = {
			SUNDAY: 	{ID: 0, VALUE: "(日)"},
			MONDAY: 	{ID: 1, VALUE:"(月)"},
			TUESDAY: 	{ID: 2, VALUE:"(火)"},
			WENDESDAY: 	{ID: 3, VALUE:"(水)"},
			THURSDAY: 	{ID: 4, VALUE:"(木)"},
			FRIDAY: 	{ID: 5, VALUE:"(金)"},
			SATURDAY: 	{ID: 6, VALUE:"(土)"}
		};
		
		// Mapping with column in HTML of calendar
		var COLUMN = {
			DAY_ONE: 	0,
			DAY_TWO: 	1,
			DAY_THREE: 	2,
			DAY_FOUR: 	3,
			DAY_FIVE: 	4,
			DAY_SIX: 	5,
			DAY_SEVEN: 	6
		}
		
		// Number column of calendar in HTML
				
		this.date = new Array(7);
		this.hour = {};
		this.dataBooking = {};
		
		/**
		 * Init Date for calendar
		 **/		
		this.initDate = function(date, startDate, endDate) {
			// Get number day in this month
			var daysInMonth = new Date(date[0].getFullYear(), date[0].getMonth()+1, 0).getDate();
					
			// Set value for all element
			for (var idx = startDate; idx < endDate; idx++){
				if (idx > 0) {
					date[idx] = new Date();
					// Get last day and increase 1 day
					date[idx].setDate(date[idx - 1].getDate() + 1);
				}
				
				// Append day japanese for calendar
				switch (date[idx].getDay()) {
					// Sunday
					case DAY.SUNDAY.ID:
						this.date[idx] = {
							column: idx,
							class: "sunday",	// This class define in CSS
							value: date[idx].getDate() + DAY.SUNDAY.VALUE
						}
						break;
						
					// Monday
					case DAY.MONDAY.ID:
						this.date[idx] = {
							column: idx,
							class: "",
							value: date[idx].getDate() + DAY.MONDAY.VALUE
						}
						break;	
						
					// Tuesday
					case DAY.TUESDAY.ID:
						this.date[idx] = {
							column: idx,
							class: "",
							value: date[idx].getDate() + DAY.TUESDAY.VALUE
						}
						break;
						
					// Wendnesday
					case DAY.WENDESDAY.ID:
						this.date[idx] = {
							column: idx,
							class: "",
							value: date[idx].getDate() + DAY.WENDESDAY.VALUE
						}
						break;
						
					// Thursday
					case DAY.THURSDAY.ID:
						this.date[idx] = {
							column: idx,
							class: "",
							value: date[idx].getDate() + DAY.THURSDAY.VALUE
						}
						break;
					
					// Friday	
					case DAY.FRIDAY.ID:
						this.date[idx] = {
							column: idx,
							class: "",
							value: date[idx].getDate() + DAY.FRIDAY.VALUE
						}
						break;
						
					// Saturday
					case DAY.SATURDAY.ID:
						this.date[idx] = {
							column: idx,
							class: "saturday",	// This class define in CSS
							value: date[idx].getDate() + DAY.SATURDAY.VALUE
						}
						break;
				}				
			}
		};
		
		
		/**
		 * Rendar date for calendar
		 **/
		this.renderHTMLDate = function(startDate, endDate) {
			for (var idx = startDate; idx < endDate; idx++){
				switch(this.date[idx].column) {
					// Render seven column of calendar					
					// Column 1
					case COLUMN.DAY_ONE:	
						$(".day_one").text(this.date[idx].value);
						if (this.date[idx].class !== ""){
							$(".day_one").addClass(this.date[idx].class);
						}
						break;
						
					// Column 2
					case COLUMN.DAY_TWO:
						$(".day_two").text(this.date[idx].value);
						if (this.date[idx].class !== ""){
							$(".day_two").addClass(this.date[idx].class);
						}
						break;
						
					// Column 3
					case COLUMN.DAY_THREE:
						$(".day_three").text(this.date[idx].value);
						if (this.date[idx].class !== ""){
							$(".day_three").addClass(this.date[idx].class);
						}
						break;
						
					// Column 4
					case COLUMN.DAY_FOUR:
						$(".day_four").text(this.date[idx].value);
						if (this.date[idx].class !== ""){
							$(".day_four").addClass(this.date[idx].class);
						}
						break;
						
					// Column 5
					case COLUMN.DAY_FIVE:
						$(".day_five").text(this.date[idx].value);
						if (this.date[idx].class !== ""){
							$(".day_five").addClass(this.date[idx].class);
						}
						break;
						
					// Column 6
					case COLUMN.DAY_SIX:
						$(".day_six").text(this.date[idx].value);
						if (this.date[idx].class !== ""){
							$(".day_six").addClass(this.date[idx].class);
						}
						break;
						
					// Column 7
					case COLUMN.DAY_SEVEN:
						$(".day_seven").text(this.date[idx].value);
						if (this.date[idx].class !== ""){
							$(".day_seven").addClass(this.date[idx].class);
						}
						break;
						
				}
			}
		}
		
		
		this.showDate = function() {
			console.log(this.date);
		};
		
		this.showHour = function() {
			console.log(this.hour);
		};
		
		this.showDataBooking = function() {
			console.log(this.dataBooking);
		};
	};
	
	// Date data get from server
	var	date = new Array(28);
		
	// Hour data get from server
	var	hour = {
			nine: "09:00~",
			ten: "10:00~",
			eleven: "11:00~",
			twelve: "12:00~",
			thirteen: "13:00~",
			fourteen: "14:00~",
			fifteen: "15:00~",
			sixteen: "16:00~",
			seventeen: "17:00~",
			eighteen: "18:00~",
			nineteen: "19:00~"
		};
		
	// Data booking get from server
	var	data_booking = {
			row_nine : ["0", "0", "1", "2", "0", "0", "1"],
			row_ten : ["0", "0", "1", "2", "0", "0", "1"],
			row_eleven : ["0", "0", "1", "2", "0", "0", "1"],
			row_twelve : ["0", "0", "1", "2", "0", "0", "1"],
			row_thirteen : ["0", "0", "1", "2", "0", "0", "1"],
			row_fourteen : ["0", "0", "1", "2", "0", "0", "1"],
			row_fifteen : ["0", "0", "1", "2", "0", "0", "1"],
			row_sixteen : ["0", "0", "1", "2", "0", "0", "1"],
			row_seventeen : ["0", "0", "1", "2", "0", "0", "1"],
			row_eighteen : ["0", "0", "1", "2", "0", "0", "1"],
			row_nineteen : ["0", "0", "1", "2", "0", "0", "1"]
		};
	
	// Test show data 
	var obj = new Calendar();
	
	date[0] = new Date();
	//date[0].setDate(date[0].getDate() + 5);
	obj.initDate(date, 0, 28);
	obj.renderHTMLDate(0,28);
	obj.showDate();
}); 