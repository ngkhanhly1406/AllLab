<?php

namespace App\Http\Controllers;

use App\Models\Book;
use Illuminate\Http\Request;

class BookController extends Controller
{
    
    public function index()
    {
        $books = Book::all();
        return view('books.index', compact('books'));
    }

    public function search(Request $request)
    {
        $searchTerm = $request->input('search');
        $books = Book::where('title', 'LIKE', '%' . $searchTerm . '%')->get();
        return view('books.index', compact('books', 'searchTerm'));
    }
    
    public function store(Request $request)
    {
       
    }

    
    public function show( Book $book)
    {
        return view('books.show', compact('book'));
    }

    
    public function destroy(Book $book)
    {
        $book->delete();

        return redirect()->route('books.index')->with('success', 'Book deleted successfully!');
    }
}
