export class Message {
  id!: string;
  content!: string;
  likes!: number;
  createdDate: Date = new Date('now');
  updatedDate: Date =  new Date('now')

  constructor() {}
}
