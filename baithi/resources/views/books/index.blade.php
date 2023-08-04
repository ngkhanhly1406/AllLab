<!DOCTYPE html>
<html>
<head>
    <title>Book Management</title>
</head>
<body>
    <h1>All Books</h1>
    <ul>
        @foreach ($books as $book)
            <li>{{ $book->title }} - ISBN: {{ $book->ISBN }} - Publication Year: {{ $book->pub_year }}</li>
        @endforeach
    </ul>

    <h1>Search Books</h1>
    <form action="{{ route('books.search') }}" method="GET">
        <input type="text" name="search" value="{{ $searchTerm ?? '' }}" placeholder="Enter book name">
        <button type="submit">Search</button>
    </form>
</body>
</html>
