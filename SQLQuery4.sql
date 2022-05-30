USE [MSATrialDb]
GO

/****** Object:  Table [dbo].[current_account]    Script Date: 30.05.2022 08:28:18 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[current_account](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[account_content] [varchar](255) NOT NULL,
	[address] [varchar](255) NOT NULL,
	[tax_administration] [varchar](255) NOT NULL,
	[tax_number] [varchar](255) NOT NULL,
	[account_detail] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[current_account]  WITH CHECK ADD  CONSTRAINT [FKha32ix88acrwtiyqg6x8achxx] FOREIGN KEY([account_detail])
REFERENCES [dbo].[account_detail] ([id])
GO

ALTER TABLE [dbo].[current_account] CHECK CONSTRAINT [FKha32ix88acrwtiyqg6x8achxx]
GO


