<!DOCTYPE html>
<html>
<head>
    <title>Book Details</title>
</head>
<body>
    <h1>Book Details</h1>
    <p>Title: {{ $book->title }}</p>
    <p>Author ID: {{ $book->authorid }}</p>
    <p>International Standard Book Number: {{ $book->ISBN }}</p>
    <p>Publication Year: {{ $book->pub_year }}</p>

    <a href="{{ route('books.index') }}">Back to All Books</a>
</body>
</html>
