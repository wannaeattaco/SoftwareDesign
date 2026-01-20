async function fetchName() {
  try {
    const response = await fetch('http://localhost:3000/api/hello');
    if (!response.ok) {
      throw new Error(`HTTP error! status: ${response.status}`);
    }
    const data = await response.json();
    return data.name; // Assuming your API returns { name: "..." }
  } catch (error) {
    console.error('Error fetching name:', error);
    return 'Error fetching name'; // Or handle the error as needed
  }
}

export default async function Home() {
  const name = await fetchName();

  return (
    <div>
      <h1>Hello, {name}!</h1>
    </div>
  );
}