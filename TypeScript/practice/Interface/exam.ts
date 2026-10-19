interface Exam {
    name: string;
    score: number;
    date: Date;
    venue?: string; // Optional property
    status?: 'passed' | 'failed'; // Optional property with specific string values
}


function getExamDeatils(exam: Exam) {

    return `Exam Name: ${exam.name}, Score: ${exam.score}, Date: ${exam.date.toDateString()}`;




}

function getAllDetails(exam: Exam) {


    return `Exaam name: ${exam.name}, Score: ${exam.score}, Date: ${exam.date.toDateString()}, Venue: ${exam.venue ?? 'Not specified'}, Status: ${exam.status ?? 'Not specified'}`;
}

let exam1: Exam = {
    name: 'Maths',
    score: 85,  
    date: new Date('2024-06-15'),
    venue: 'Room 101',
    status: 'passed'
};

let exam2: Exam = {
    name: 'Science',
    score: 70,
    date: new Date('2024-06-20'),
    // venue and status are optional and not provided here
};

console.log(getExamDeatils(exam1)); // Output: Exam Name: Maths, Score: 85, Date: Sat Jun 15 2024
console.log(getAllDetails(exam2)); // Output: Exam Name: Maths, Score: 85, Date: Sat Jun 15 2024, Venue: Room 101, Status: passed
