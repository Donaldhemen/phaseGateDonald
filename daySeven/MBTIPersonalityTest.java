import java.util.Scanner;
public MBTIPersonalityTest{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        String[] questionOne = {"A. expend energy, enjoy groups, B.conserve energy, enjoy one-on-one"}; 
        String[] questionTwo = {"A.interpret literally, B.look for meaning and possibilities"}; 
        String[] questionThree = {"A.logical, thinking, questioning, B.empathetic, feeling, accommodating"}; 
        String[] questionFour = {"A.organized, orderly, B.flexible, adaptable"}; 
        String[] questionFive = {"A.more outgoing, think out loud, B.more reserved, think to yourself"};
        String[] questionSix = {"A.practical, realistic, experiential, B.imaginative, innovative, theoretical"};
        String[] questionSeven = {"A.candid, straightforward, frank, B.tactful, kind, encouraging"};
        String[] questionEight = {"A.plan, schedule, B.unplanned, spontaneous"};
        String[] questionNine = {"A.seek many tasks, public activities, interaction with others, B.seek private, solitary activities with quiet to concentrate"};
        String[] questionTen = {"A.standard, usual, conventional, B.different, novel, unique"};
        String[] questionEleven = {"A.firm, tend to criticize, hold the line, B.gentle, tend to appreciate, conciliate"};
        String[] questionTwelve = {"A.regulated, structured, B.easy-going, live and let live"};
        String[] questionThirteen = {"A.external, communicative, express yourself, B.internal, reticent, keep to yourself"};
        String[] questionFourteen = {"A.focus on here-and-now, B.look to the future, global perspective, big picture"};
        String[] questionFifteen = {"A.tough-minded, just, B.tender-hearted, merciful"};
        String[] questionSixteen = {"A.preparation, plan ahead, B.go with the flow, adapt as you go"};
        String[] questionSeventeen = {"A.active, initiate, B.reflective, deliberate"};
        String[] questionEighteen = {"A.facts, things, what is, B.ideas, dreams, what could be, philosophical"};
        String[] questionNineteen = {"A.matter of fact, issue-oriented, B.sensitive, people-oriented, compassionate"};
        String[] questionTwenty = {"A.control, govern, B.latitude, freedom"};
        
        String[][] questions = {questionOne, questionTwo, questionThree, questionFour,questionFive, questionSix, questionSeven, questionEight, questionNine, questionTen, questionEleven, questionTwelve, questionThirteen, questionFourteen, questionFifteen, questionSixteen, questionSeventeen, questionEighteen, questionNineteen, questionTwenty};
        
        String IFNP = """
        INFP

        Healer
        The Thoughtful Idealist (MBTI)
        The Mediator (16Personalities)

The INFP Personality Type

INFPs are imaginative idealists, guided by their own core values and beliefs. To a Healer, possibilities are paramount; the realism of the moment is only of passing concern. They see potential for a better future, and pursue truth and meaning with their own individual flair.

INFPs are sensitive, caring, and compassionate, and are deeply concerned with the personal growth of themselves and others. Individualistic and nonjudgmental, INFPs believe that each person must find their own path. They enjoy spending time exploring their own ideas and values, and are gently encouraging to others to do the same. INFPs are creative and often artistic; they enjoy finding new outlets for self-expression.

What does INFP stand for?

INFP is one of the sixteen personality types created by Katharine Briggs and Isabel Myers, creators of the Myers-Briggs Type Indicator (MBTI). INFP stands for Introversion, iNtuition, Feeling, and Perceiving, which are four core personality traits based on the work of psychologist C.G. Jung.

Each of the four letters of the INFP code signifies a key personality trait of this type. INFPs are energized by time alone (Introverted), focus on ideas and concepts rather than facts and details (iNtuitive), make decisions based on feelings and values (Feeling), and prefer to be spontaneous and flexible rather than planned and organized (Perceiving).
        """;
        
        String INFJ = """
        INFJ

        Advocate
        The Insightful Idealist (MBTI)
        The Advocate (16Personalities)

The INFJ Personality Type

INFJs are thoughtful idealists who combine strong personal values with a deep desire to understand people and the world around them. They are often guided by a sense of purpose and are motivated by the possibility of creating positive change.

INFJs are empathetic, insightful, and highly attentive to the emotions and needs of others. They tend to be private and reflective, preferring meaningful conversations over superficial interactions. They often develop a clear vision of what they believe the future could become and work patiently toward that vision.

INFJs are compassionate and organized. They enjoy helping others discover their potential and may be drawn toward activities that allow them to express their values, creativity, and understanding of people.

What does INFJ stand for?

INFJ stands for Introversion, iNtuition, Feeling, and Judging.

INFJs are energized by time alone (Introverted), focus on possibilities and underlying meanings (iNtuitive), make decisions based strongly on values and human considerations (Feeling), and prefer structure, organization, and planning (Judging).
        """;
        
        String ENFP = """
        ENFP

        Campaigner
        The Enthusiastic Idealist (MBTI)
        The Campaigner (16Personalities)

The ENFP Personality Type

ENFPs are enthusiastic, imaginative, and curious people who enjoy exploring possibilities and connecting with others. They are often energized by new ideas, experiences, and opportunities.

ENFPs are warm, expressive, and open-minded. They enjoy understanding people and discovering what makes them unique. Their enthusiasm can inspire others, and they often bring creativity and energy to groups and projects.

ENFPs enjoy freedom and variety and may become bored with excessive routine. They are often interested in personal growth, creativity, relationships, and exploring new possibilities.

What does ENFP stand for?

ENFP stands for Extraversion, iNtuition, Feeling, and Perceiving.

ENFPs gain energy from interacting with others (Extraverted), focus on possibilities and ideas (iNtuitive), consider personal values and people's feelings when making decisions (Feeling), and prefer flexibility and spontaneity (Perceiving).
        """;
        
        String ENFJ = """
        ENFJ

        Protagonist
        The Inspiring Idealist (MBTI)
        The Protagonist (16Personalities)

The ENFJ Personality Type

ENFJs are warm, charismatic, and people-oriented individuals who often have a strong interest in helping others succeed. They naturally pay attention to group dynamics and may take leadership roles.

ENFJs are empathetic and encouraging. They enjoy bringing people together and helping individuals recognize their strengths. They often communicate confidently and can motivate others toward a shared goal.

ENFJs value cooperation, relationships, and personal development. They may become particularly motivated when they believe their efforts can make a meaningful difference.

What does ENFJ stand for?

ENFJ stands for Extraversion, iNtuition, Feeling, and Judging.

ENFJs gain energy from people and interaction (Extraverted), focus on possibilities and the bigger picture (iNtuitive), emphasize values and human needs (Feeling), and prefer organization, planning, and structure (Judging).
        """;
        
        String INTP = """
        INTP

        Logician
        The Analytical Thinker (MBTI)
        The Logician (16Personalities)

The INTP Personality Type

INTPs are curious, analytical, and independent thinkers who enjoy understanding how things work. They often approach problems by breaking them down into logical components.

INTPs enjoy exploring theories, concepts, systems, and possibilities. They are usually more interested in discovering whether an idea makes sense than in following established conventions.

INTPs value intellectual independence and may spend considerable time thinking deeply about a problem before expressing their conclusions. They often enjoy programming, mathematics, science, technology, and theoretical subjects.

What does INTP stand for?

INTP stands for Introversion, iNtuition, Thinking, and Perceiving.

INTPs gain energy from time alone (Introverted), focus on concepts and possibilities (iNtuitive), prioritize logic and objective analysis (Thinking), and prefer flexibility and keeping their options open (Perceiving).
        """;
        String INTJ = """
        INTJ

        Architect
        The Strategic Thinker (MBTI)
        The Architect (16Personalities)

The INTJ Personality Type

INTJs are independent, strategic, and analytical thinkers who enjoy developing systems and long-term plans. They often focus on how things can be improved or made more efficient.

INTJs are curious and intellectually independent. They tend to value competence, knowledge, and logical reasoning. Rather than simply accepting an existing system, they may ask how it could be redesigned or improved.

INTJs often enjoy working toward ambitious goals and may prefer to work independently when they have a clear vision of what needs to be accomplished.

What does INTJ stand for?

INTJ stands for Introversion, iNtuition, Thinking, and Judging.

INTJs gain energy from solitude (Introverted), focus on patterns and possibilities (iNtuitive), make decisions using logic and objective analysis (Thinking), and prefer structure and planned action (Judging).
        """;
        
        String ENTP = """
        ENTP

        Debater
        The Innovative Thinker (MBTI)
        The Debater (16Personalities)

The ENTP Personality Type

ENTPs are curious, energetic, and intellectually adventurous. They enjoy examining ideas from different perspectives and challenging assumptions.

ENTPs often enjoy debates and discussions, not necessarily because they want to argue, but because they enjoy exploring ideas. They are frequently attracted to problems that require creativity and unconventional thinking.

ENTPs enjoy variety and may quickly move from one interesting idea to another. They can be innovative problem-solvers and often enjoy discovering new approaches.

What does ENTP stand for?

ENTP stands for Extraversion, iNtuition, Thinking, and Perceiving.

ENTPs gain energy through interaction and discussion (Extraverted), focus on possibilities (iNtuitive), prioritize logical analysis (Thinking), and prefer flexibility and spontaneity (Perceiving).
        """;
        
        String ENTJ = """
        ENTJ

        Commander
        The Strategic Leader (MBTI)
        The Commander (16Personalities)

The ENTJ Personality Type

ENTJs are confident, strategic, and goal-oriented individuals who often enjoy organizing people and resources to accomplish objectives.

ENTJs tend to focus on efficiency and results. They are comfortable making decisions and taking responsibility, particularly when a clear goal needs to be achieved.

They often enjoy leadership, planning, problem-solving, and improving inefficient systems. They may be particularly motivated by challenging goals and opportunities to build something successful.

What does ENTJ stand for?

ENTJ stands for Extraversion, iNtuition, Thinking, and Judging.

ENTJs gain energy from interaction (Extraverted), focus on possibilities and long-term goals (iNtuitive), emphasize logic and effectiveness (Thinking), and prefer structure and organized action (Judging).
        """;
        
        String ISFP = """
        ISFP

        Adventurer
        The Creative Explorer (MBTI)
        The Adventurer (16Personalities)

The ISFP Personality Type

ISFPs are gentle, creative, and independent individuals who often appreciate beauty, experiences, and personal freedom.

ISFPs tend to live in the present and pay close attention to their surroundings. They often express themselves through art, music, design, fashion, or other creative activities.

They are usually considerate of other people's feelings but may prefer expressing themselves through actions rather than lengthy explanations. They value authenticity and personal freedom.

What does ISFP stand for?

ISFP stands for Introversion, Sensing, Feeling, and Perceiving.

ISFPs gain energy from time alone (Introverted), focus on real experiences and details (Sensing), make decisions according to personal values (Feeling), and prefer flexibility and spontaneity (Perceiving).
        """;
        
        String ISFJ = """
        ISFJ

        Defender
        The Dedicated Protector (MBTI)
        The Defender (16Personalities)

The ISFJ Personality Type

ISFJs are responsible, caring, and dependable individuals who often take satisfaction in helping others and maintaining stability.

ISFJs tend to pay attention to practical details and remember information about people and situations. They often demonstrate care through reliable actions rather than dramatic expressions.

They value loyalty, responsibility, tradition, and cooperation. ISFJs may work quietly behind the scenes to make sure that people and responsibilities are properly taken care of.

What does ISFJ stand for?

ISFJ stands for Introversion, Sensing, Feeling, and Judging.

ISFJs gain energy from time alone (Introverted), focus on concrete information and experience (Sensing), consider people's needs and values (Feeling), and prefer organization and structure (Judging).
        """;
        
        String ESFP = """
        ESFP

        Entertainer
        The Energetic Experiencer (MBTI)
        The Entertainer (16Personalities)

The ESFP Personality Type

ESFPs are energetic, friendly, spontaneous, and enthusiastic people who enjoy experiencing life and connecting with others.

ESFPs often bring energy and humor into social situations. They tend to be attentive to their surroundings and enjoy activities that allow them to interact with people and experience something directly.

They often prefer practical experiences over abstract theories and may be adaptable when circumstances change.

What does ESFP stand for?

ESFP stands for Extraversion, Sensing, Feeling, and Perceiving.

ESFPs gain energy from social interaction (Extraverted), focus on present experiences (Sensing), consider personal values and people's feelings (Feeling), and prefer flexibility and spontaneity (Perceiving).
        """;
        
        String ESFJ = """
        ESFJ

        Consul
        The Supportive Organizer (MBTI)
        The Consul (16Personalities)

The ESFJ Personality Type

ESFJs are sociable, caring, responsible, and cooperative individuals who often enjoy creating harmony within groups.

ESFJs tend to notice the practical needs of people around them and are often willing to help. They value relationships, cooperation, and social responsibility.

They are frequently comfortable organizing events, coordinating people, and ensuring that everyone feels included and supported.

What does ESFJ stand for?

ESFJ stands for Extraversion, Sensing, Feeling, and Judging.

ESFJs gain energy from interaction (Extraverted), focus on practical information (Sensing), consider people's feelings and values (Feeling), and prefer organization and planning (Judging).
        """;
        
        String ISTP = """
        ISTP

        Virtuoso
        The Practical Problem-Solver (MBTI)
        The Virtuoso (16Personalities)

The ISTP Personality Type

ISTPs are practical, curious, independent, and adaptable individuals who often enjoy understanding how things work.

ISTPs tend to learn effectively through hands-on experience. They may enjoy experimenting, building, repairing, troubleshooting, and finding practical solutions.

They often prefer freedom rather than excessive rules and can remain calm when dealing with unexpected problems. Their curiosity may lead them to explore technology, mechanics, engineering, or practical skills.

What does ISTP stand for?

ISTP stands for Introversion, Sensing, Thinking, and Perceiving.

ISTPs gain energy from time alone (Introverted), focus on practical information (Sensing), use logical analysis (Thinking), and prefer flexibility and adaptability (Perceiving).
        """;
        
        String ISTJ = """
        ISTJ

        Logistician
        The Reliable Organizer (MBTI)
        The Logistician (16Personalities)

The ISTJ Personality Type

ISTJs are responsible, organized, practical, and dependable individuals who value accuracy and reliability.

ISTJs often prefer clear expectations and established procedures. They take commitments seriously and tend to approach tasks carefully and systematically.

They are often comfortable working independently and may excel in situations requiring attention to detail, consistency, and responsibility.

What does ISTJ stand for?

ISTJ stands for Introversion, Sensing, Thinking, and Judging.

ISTJs gain energy from solitude (Introverted), focus on facts and concrete information (Sensing), make decisions using logic (Thinking), and prefer organization and structure (Judging).
        """;
        
        String ESTP = """
        ESTP

        Entrepreneur
        The Action-Oriented Explorer (MBTI)
        The Entrepreneur (16Personalities)

The ESTP Personality Type

ESTPs are energetic, practical, adaptable, and action-oriented individuals who enjoy solving problems in real time.

ESTPs often learn through direct experience and are comfortable responding to unexpected situations. They tend to focus on what is happening now rather than spending too much time on hypothetical possibilities.

They may enjoy competition, challenges, social activities, and situations requiring quick decisions. Their confidence and adaptability can make them effective in dynamic environments.

What does ESTP stand for?

ESTP stands for Extraversion, Sensing, Thinking, and Perceiving.

ESTPs gain energy from interaction (Extraverted), focus on present experiences and practical information (Sensing), prioritize logic (Thinking), and prefer flexibility and spontaneous action (Perceiving).
        """;
        
        String ESTJ = """
        ESTJ

        Executive
        The Practical Leader (MBTI)
        The Executive (16Personalities)

The ESTJ Personality Type

ESTJs are organized, practical, confident, and goal-oriented individuals who often enjoy taking responsibility and bringing structure to situations.

ESTJs value efficiency, clear expectations, and dependable systems. They tend to approach problems directly and may naturally take leadership positions when organization and decision-making are required.

They often appreciate traditions, rules, and established procedures when these help a group operate effectively.

What does ESTJ stand for?

ESTJ stands for Extraversion, Sensing, Thinking, and Judging.

ESTJs gain energy from interaction (Extraverted), focus on practical facts and experience (Sensing), make decisions using logic and objective standards (Thinking), and prefer structure, planning, and organization (Judging).
        """;
        
        
    }
}
