"use strict";
function getExamDeatils(exam) {
    return `Exam Name: ${exam.name}, Score: ${exam.score}, Date: ${exam.date.toDateString()}`;
}
function getAllDetails(exam) {
    return `Exaam name: ${exam.name}, Score: ${exam.score}, Date: ${exam.date.toDateString()}, Venue: ${exam.venue ?? 'Not specified'}, Status: ${exam.status ?? 'Not specified'}`;
}
console.log(getExamDeatils({ name: 'Maths', score: 95, date: new Date('2023-05-15') }));
console.log(getAllDetails({ name: 'Science', score: 88, date: new Date('2023-06-20'), venue: 'Room 101', status: 'passed' }));
