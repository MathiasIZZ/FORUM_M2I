import {Message} from "./Message.entity";

export class Sujet {
  id!: string;
  title!: string;
  likes!: number;
  messages!: Message[];
  createdDate: Date = new Date('now');
  updatedDate: Date = new Date('now');
}
