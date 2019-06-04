<%@ page language="java"
	import="java.awt.*"
	import="java.awt.image.BufferedImage"
	import="java.util.*"
	import="javax.imageio.ImageIO"	
	pageEncoding="gb2312"%>
<%
	response.setHeader("Cache-Control","no-cache"); 
	//����һ���������ֺ��ַ�������
	char[] array = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
					'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 
					'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 
					'u', 'v', 'w', 'x', 'y', 'z'};	
	// ���ڴ��д���ͼ�� 
	int width = 60, height = 20;
	BufferedImage image = new BufferedImage(width, height,
		BufferedImage.TYPE_INT_RGB);
	//��ȡ����
	Graphics g = image.getGraphics();
	//�趨����ɫ 
	g.setColor(new Color(200, 200, 200));
	g.fillRect(0, 0, width, height);
	//ȡ�����������֤��(4λ���ֺ��ַ������) 
	String randStr = "";
	for(int i=0;i<4;i++){
		int pos = Math.round((float)Math.random()*(array.length-1));
		randStr += array[pos];
	}
	//����֤�����session
	session.setAttribute("randStr", randStr);
	//����֤����ʾ��ͼ���� 
	g.setColor(Color.black);
	g.setFont(new Font("", Font.PLAIN, 20));
	g.drawString(randStr, 10, 17);
	// �������100�����ŵ㣬ʹͼ���е���֤�벻�ױ���������̽�⵽ 
	Random rnd = new Random();
	for (int i = 0; i < 100; i++){
		int x = rnd.nextInt(width);
		int y = rnd.nextInt(height);
		g.drawOval(x, y, 1, 1);
	}
	// ���ͼ��ҳ�� 
	ImageIO.write(image, "JPEG", response.getOutputStream());
	out.clear();
	out = pageContext.pushBody();
%>
