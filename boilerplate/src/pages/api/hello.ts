// Next.js API route support: https://nextjs.org/docs/api-routes/introduction
import { Student } from "@/lib/student";
import type { NextApiRequest, NextApiResponse } from "next";

type Data = {
  name: string;
};

export default function handler(
  req: NextApiRequest,
  res: NextApiResponse<Data>,
) {
  const student = new Student("John Doe");
  res.status(200).json({ name: student.getName() });
}
